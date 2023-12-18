import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		int a = 0 , b = 0, c = 0, d = 0, e = 0 , f = 0, g = 0, h = 0 , i = 0;
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		for(int j = 0 ; j < N ; j++){
			int k = sc.nextInt();
			
			if(1 <= k && k < 400){a = a + 1;				
			}else if(400 <= k && k < 800){b = b + 1;				
			}else if(800 <= k && k < 1200){c = c + 1;				
			}else if(1200 <= k && k < 1600){d = d + 1;				
			}else if(1600 <= k && k < 2000){e = e + 1;				
			}else if(2000 <= k && k < 2400){f = f + 1;				
			}else if(2400 <= k && k < 2800){g = g + 1;				
			}else if(2800 <= k && k < 3200){h = h + 1;				
			}else if(3200 <= k){i = i + 1;				
			}			
		}
		
		int n = 0;
		
		if(a!=0){n++;}
		if(b!=0){n++;}
		if(c!=0){n++;}
		if(d!=0){n++;}
		if(e!=0){n++;}
		if(f!=0){n++;}
		if(g!=0){n++;}
		if(h!=0){n++;}
		
		int max = 0, min = n;
		
		if(n+i>=8){max = 8;
		}else{max = n + i;
		}
		System.out.print(min + " ");
		System.out.println(max);

		
	}

}