
import java.util.Scanner;
//
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		int n =sc.nextInt();
		int m =sc.nextInt();
		int[] s_array=new int[m];
		int[] c_array=new int[m];
		for (int i=0;i<m;i++) {
			s_array[i]=sc.nextInt();
			c_array[i]=sc.nextInt();
		}
		int ans =-1;
			
		int start=100;
		int end=1000;
		if (n==1) {
			start=0;
			end=10;
		} else if (n==2){
			start=10;
			end=100;
		}
		for (int i=start;i<end;i++) {
			String st = String.valueOf(i);
			if(st.length() != n){
				continue;
			}
			char[] array = st.toCharArray();
			int[] numbers =new int[3];
			numbers[0]=Character.getNumericValue(array[0]);
			numbers[1]=Character.getNumericValue(array[1]);
			numbers[2]=Character.getNumericValue(array[2]);
			
			boolean isAns=true;
			for (int j=0;j<m;j++) {
				int s =s_array[j];
				int c =c_array[j];
				if (numbers[s-1]!=c) {
					isAns =false;
				}
			}
			if (isAns) {
				ans =i;
				break;
			}
			
			}
		System.out.println(ans);
		
			//━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━
		}
		//----------------------------------------
		//置き場
		
		//----------------------------------------
	}