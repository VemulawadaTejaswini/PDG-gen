import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);		
		String str = sc.next();
        int ans = str.length();
        int ans2 = ans;
        while(ans2>0){StringBuilder sb = new StringBuilder();
        for(int i=0;i<ans2-1;i++){
        if(str.substring(i,i+2).equals("ST")){if(i>0){sb.append(str.substring(0,i));}
                                              if(i+2<ans2){sb.append(str.substring(i+2,ans2));}
                                              str = sb.toString();
                                              ans2-=2;
                                              ans=ans2;
                                              break;
                                             }                                                                                                               
                               else{if(i==ans2-2){ans2=0;}
                                   }
                     } 
                     }       
		System.out.println(ans);
	}
}