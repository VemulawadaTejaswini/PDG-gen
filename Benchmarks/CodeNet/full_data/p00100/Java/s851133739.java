package test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = null;
		try{
			br = new  BufferedReader (new InputStreamReader(System.in));
			while(true){
				int n = Integer.parseInt(br.readLine());
				if(n == 0)break;
				List list = new ArrayList<int[]>();
				for(int i = 0; i < n;i++){
					String[] buf = br.readLine().split(" ");
					int p ,q,id;
					id = Integer.parseInt(buf[0]);
					p = Integer.parseInt(buf[1]);q = Integer.parseInt(buf[2]);
					int[] data = null;
					boolean bool = false;
					for(int j = 0; j<list.size();j++){
						data = (int[])list.get(j);
						if(data[0] == id){
							data[1] += p*q;
							list.set(j, data);
							bool = true;
							break;
						}
					}
					if(!bool){
						data= new int[2];
						data[0] = id;
						data[1] = p*q;
						list.add(data);
					}
				}
				boolean bool = false;
				Iterator it = list.iterator();
				while(it.hasNext()){
					int[] data = (int[])it.next();
					if(data[1] >=1000000){
						bool = true;
						System.out.println(data[0]);
					}
				}
				if(!bool){
					System.out.println("NA");
				}
			}
		}finally{
			br.close();
		}
	}

}