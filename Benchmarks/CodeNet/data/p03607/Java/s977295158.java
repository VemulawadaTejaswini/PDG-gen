import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int [] in = new int [a];
        int b = 1;
        int c = 1;      
        if(a>1){for(int i=0;i<a;i++){in[i] = sc.nextInt();                            
                                    }
                Arrays.sort(in);       
                for(int i=1;i<a;i++){if(in[i]==in[i-1]){c++;}
                             
                                     else{if(c%2==1){b++;}else{b--;}c=1;}                            
                                     if(i==a-1){if(c%2==1){b++;}else{b--;}                                     
                                               }                          
                                    }
               }
		System.out.println(b);
	}
}
