import java.io.*;
import java.lang.*;
import java.util.Scanner;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class Main {
	public static void main(String[] args){
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String buf;
		ConcurrentHashMap<Integer,Integer> states = new ConcurrentHashMap<Integer,Integer>(10000);
		try {
			for(;;){
				buf = br.readLine();
				if(buf == null){
					break;
				}
				Scanner scanner = new Scanner(buf);
				if(!scanner.hasNext()){
					break;
				}
				int i;
				int initState = 0;
				for(i = 0; i < 8; i++){
					initState |= scanner.nextByte() << (i * 3);
				}
				states.put(initState, 0);
				for(i = 0; ; i++){
					if(states.containsKey(0xFAC688)){
						System.out.println(states.get(0xFAC688));
						break;
					}
					for(Map.Entry<Integer, Integer> e : states.entrySet()){
						if(e.getValue() == i){
							int nMap, cMap = e.getKey();
							int p0x = 0, p0y = 0;
							int k;
							for(k = 0; k < 8; k++){
								if(((cMap >>> (k * 3)) & 7) == 0){
									p0x = k % 4;
									p0y = k / 4;
									break;
								}
							}
							//System.out.println(i);
							if(k == 8){
								return;
							}
							if(p0y == 1){
								nMap = Main.getExchanged(cMap, p0x, 0, p0x, 1);
								if(!states.containsKey(nMap)){
									states.put(nMap, i + 1);
									//Main.printMap(nMap);
								}
							}
							if(p0x != 3){
								nMap = Main.getExchanged(cMap, p0x, p0y, p0x + 1, p0y);
								if(!states.containsKey(nMap)){
									states.put(nMap, i + 1);
									//Main.printMap(nMap);
								}
							}
							if(p0y == 0){
								nMap = Main.getExchanged(cMap, p0x, 0, p0x, 1);
								if(!states.containsKey(nMap)){
									states.put(nMap, i + 1);
									//Main.printMap(nMap);
								}
							}
							if(p0x != 0){
								nMap = Main.getExchanged(cMap, p0x, p0y, p0x - 1, p0y);
								if(!states.containsKey(nMap)){
									states.put(nMap, i + 1);
									//Main.printMap(nMap);
								}
							}
						}
					}
				}
				//System.out.println(Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory());
				states.clear();
			}
		}
		catch(IOException e) {
			System.out.println("Read error.");
			return;
		}
	}
	public static int getExchanged(int org, int px, int py, int qx, int qy){
		int p, q;
		p = ((org >>> ((py * 4 + px) * 3)) & 7);
		q = ((org >>> ((qy * 4 + qx) * 3)) & 7);
		org &= ~(7 << ((py * 4 + px) * 3));
		org |= q << ((py * 4 + px) * 3);
		org &= ~(7 << ((qy * 4 + qx) * 3));
		org |= p << ((qy * 4 + qx) * 3);
		return org;
	}
	public static void printMap(int map){
		int i;
		System.out.println(Integer.toHexString(map));
		for(i = 0; i < 4; i++){
			System.out.print(((map >>> (i * 3)) & 7) + " ");
		}
		System.out.println();
		for(i = 4; i < 8; i++){
			System.out.print(((map >>> (i * 3)) & 7) + " ");
		}
		System.out.println();
		System.out.println();
	}
}