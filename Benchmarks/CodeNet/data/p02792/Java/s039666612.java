import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();		
        int b = 0;
        int c,d;
        for(int i=1;i<=a;i++){if(i<10){c=i;}else{if(i<100){c=i/10;}
                                                else{if(i<1000){c=i/100;}
                                                    else{if(i<10000){c=i/1000;}
                                                        else{if(i<100000){c=i/10000;}
                                                            else{c=i/100000;}}}}}                              
         for(int j=i;j<=a;j++){if(j<10){d=j;}else{if(j<100){d=j/10;}
                                                else{if(j<1000){d=j/100;}
                                                    else{if(j<10000){d=j/1000;}
                                                        else{if(j<100000){d=j/10000;}
                                                            else{d=j/100000;}}}}} 
           if(j%10==c && i%10==d){if(j==i){b++;}else{b+=2;}}
         }                    
        }                              
		System.out.println(b);
	}
}