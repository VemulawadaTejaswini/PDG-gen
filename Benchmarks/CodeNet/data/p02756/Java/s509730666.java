import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner as = new Scanner(System.in);
		String st = as.next(); 
		int n = Integer.parseInt(as.next());
		int k = 0;
		for(int i=0;i<n;i++){
			int a = Integer.parseInt(as.next());
			if(a == 1){
				k++;
			}else{
				int b = Integer.parseInt(as.next());
              StringBuffer buf = new StringBuffer();
				if(b == 1&&k%2==0){
                  buf.append(as.next());
buf.append(st);
					st = buf.toString();
				}else if(b == 1&&k%2==1){
                 buf.append(st);
					buf.append(as.next());
					st = buf.toString();
				}else if(b == 2&&k%2==1){
					buf.append(as.next());
buf.append(st);
					st = buf.toString();
				}else if(b == 2&&k%2==0){
					buf.append(st);
					buf.append(as.next());
					st = buf.toString();
				}
			}
		}
		if(k%2==0){
			System.out.println(st);
		}else{
			StringBuffer str = new StringBuffer(st);
			System.out.println(str.reverse().toString());
		}
	}
}