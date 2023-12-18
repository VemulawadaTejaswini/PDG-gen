import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);       
		int n = sc.nextInt();
		int [] in = new int [n];
        String [] str = new String [n];
        int [] ans = new int [n];
        for(int i=0;i<n;i++){str[i] = sc.next();
                             in[i] = sc.nextInt();
                            }	
        for(int i=0;i<n;i++){int count = 0;
                             for(int j=0;j<n;j++){
          if((str[i]).compareTo(str[j])>0||(str[i].equals(str[j])&&in[i]<in[j]))
                                                 {count++;}                                                          
                                                 }                   
                             b[ans]=i+1; 
                            }
	for(int i=0;i<n;i++){System.out.println(ans[i]);}
  }
}