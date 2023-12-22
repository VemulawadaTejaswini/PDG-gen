import java.util.Scanner;
public class Main {
	public static void output(int[] a,int len){
		for(int i = 0;i < len;i++){
			if(i != len-1){
				if(a[i] > 0 && a[i+1] > 0){
					System.out.print(a[i] + " ");
				}else if(a[i] > 0 && a[i+1] < 1){
					System.out.println(a[i]);
					break;
				}
			}else{
				if(a[i] > 0){
					System.out.println(a[i]);
				}
			}
		}
	}
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		while(true){
			int n = scan.nextInt();
			if(n == 0){
				break;
			}else{
				for(int i = n;i > 0;i--){
					if(i == n){
						System.out.println(i);
					}else{
						int len = n-i;
						int[] a = new int[len+1];
						a[0] = i;
						int d = len;
						int k = 1;
						while(d > 0){
							if(i >= d){
								a[k] = d;
								break;
							}
							if(d <= i){
								a[k] = d;
								break;
							}
							a[k] = i;
							d -= i;
							k++;
						}
						output(a,len+1);
						for(int j = len;j > 0;j--){
							if(a[j] > 1){
								if((a[j]-1) >= (a[j+1]+1)){
									a[j]--;
									j++;
									a[j]++;
									output(a,len+1);
								}else{
									a[j]--;
									j++;
									a[j]++;
								}
								j++;
							}
						}
					}
				}
			}
		}
	}
}