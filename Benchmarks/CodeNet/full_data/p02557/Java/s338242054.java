import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		// 文字列の入力
		int[] d = new int[a];
		int[] e = new int[a];
		int[] f = new int [200000];
		for(int i = 0; i < a; i++){
			d[i] = sc.nextInt();
		} 
		for(int i = 0; i < a; i++){
			e[a - i - 1] = sc.nextInt();
		}
		boolean b = false;
		int l = 0;
		int r = 0;
		int r1 = 0;
		for(int i = 0; i < a; i++){
			if(d[i] == e[i]){
				if(d[i] == e[i - 1]){
					for(int j = i; i < a; j++){
						if(d[j] != e[j]){
							b =( d[j] != e[j - 1]);
							r1 = j - 1;
							break;
						}
					}
					if(b){
						for(int j = i - 2; j < a; j--){
							if(e[j] != e[j + 1]){
								l = j;
								break;
							}
						}
						for(int j = r1 + 2; j < a; j--){
							if(d[j] != d[j - 1]){
								r = j;
								break;
							}
						}
						if(r + r1 - l - i > a){
							System.out.println("No");
						}else{
							for(int j = 0;j < r1 - i + 1;j++){
								int g;
								g = e[l - j];
								e[l - j] = e[j + 1];
								e[j + i] = g;
							}
							System.out.println("Yes");
							for(int j = 0;j < a - 1;j++){
								System.out.print(e[j]);
							}
							System.out.println(e[a - 1]);
								
						}
					}
					else{
						for(int j = i - 2; j < a; j--){
							if(e[j] != e[j + 1]){
								l = j;
								break;
							}
						}
						for(int j = r1 + 2; j < a; j--){
							if(e[j] != e[j - 1]){
								r = j;
								break;
							}
						}
						if(r + r1 - l - i > a){
							System.out.println("No");
						}else{
							for(int j = 0;j < r1 - i + 1;j++){
								int g;
								g = e[l - j];
								e[l - j] = e[j + 1];
								e[j + i] = g;
							}
							System.out.println("Yes");
							for(int j = 0;j < a - 1;j++){
								System.out.print(e[j]);
							}
							System.out.println(e[a - 1]);
								
						}
					}
					
				}
				else{
					for(int j = i; i < a; j++){
						if(d[j] != e[j]){
							b =( d[j] != e[j - 1]);
							r1 = j - 1;
							break;
						}
					}
					if(b){
						for(int j = i - 2; j < a; j--){
							if(d[j] != d[j + 1]){
								l = j;
								break;
							}
						}
						for(int j = r1 + 2; j < a; j--){
							if(d[j] != d[j - 1]){
								r = j;
								break;
							}
						}
						if(r + r1 - l - i > a){
							System.out.println("No");
						}else{
							for(int j = 0;j < r1 - i + 1;j++){
								int g;
								g = e[l - j];
								e[l - j] = e[j + 1];
								e[j + i] = g;
							}
							System.out.println("Yes");
							for(int j = 0;j < a - 1;j++){
								System.out.print(e[j]);
							}
							System.out.println(e[a - 1]);
								
						}
					}
					else{
						for(int j = i - 2; j < a; j--){
							if(d[j] != d[j + 1]){
								l = j;
								break;
							}
						}
						for(int j = r1 + 2; j < a; j--){
							if(e[j] != e[j - 1]){
								r = j;
								break;
							}
						}
						if(r + r1 - l - i > a){
							System.out.println("No");
						}else{
							for(int j = 0;j < r1 - i + 1;j++){
								int g;
								g = e[l - j];
								e[l - j] = e[j + 1];
								e[j + i] = g;
							}
							System.out.println("Yes");
							for(int j = 0;j < a - 1;j++){
								System.out.print(e[j]);
							}
							System.out.println(e[a - 1]);
								
						}
					}
				}
				break;
			}
			
		}
      System.out.println("Yes");
							for(int j = 0;j < a - 1;j++){
								System.out.print(e[j]);
							}
							System.out.println(e[a - 1]);
		
		
	}
}