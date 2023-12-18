import java.util.Scanner;
 
public class Main {
	
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in);
 		int n = scan.nextInt();
		String S = scan.next();
		String a[] = new String[S.length()];

		for(int i=0;i< S.length();i++) {
			a[i]=S.substring(i, i+1);
		}

		int min = 0;
		for(int i=1;i<S.length();i++){
			int jmin = 0;
			loop : for(int j=0;j<i;j++){
				for(int k=0;k<j;k++){
					if(a[j].equals(a[k])) continue loop;
				}
				for(int k=i;k<S.length();k++){
					if(a[j].equals(a[k])){
						jmin += 1;
						break;
					}
				}
			}
			if(jmin > min){
				min = jmin;
			}
		}

		System.out.println(min);
	}
 
}