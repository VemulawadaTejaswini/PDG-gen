import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        String [] str = new String [a];
        for(int i=0;i<a;i++){str[i] = sc.next();
                             in[i] = sc.nextInt();
                            }		
        for(int i=0;i<a;i++){int ans = 1;for(int j=0;j<a;j++){
          if(str[i]>str[j]||(str[i].equals(str[j])&&in[i]<in[j])){ans++;}}
                             System.out.println(ans);}
			}
}