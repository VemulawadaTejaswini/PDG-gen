import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int mul = 0;
        for(int i = 1; i <= n; i++) {
			count = 0;
			for(int x = 1; x < 100; x++) {
				if(((x * x + x * 2 + 3) > i) || (x == 99)) {
					System.out.println(count);
					break;
				}
				for(int y = 1; y < 100; y++) {
					for(int z = 1; z < 100; z++) {
						mul = (x * x) + (y * y) + (z * z) + (x * y) + (y * z) + (z * x);
						if(mul == i){
							count++;
						}
						else if(mul > i){
							break;
						}
					}
					mul = (x * x) + (y * y) + (x + y) + x + y;
					if(mul > i){
						break;
					}
				}
			}
		}
    }
}