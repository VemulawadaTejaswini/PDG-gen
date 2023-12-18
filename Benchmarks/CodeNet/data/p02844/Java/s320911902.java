import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		String b = sc.next();
		// 出力
		int sum=0;
      	for(int i=0;i<1000;i++){
        	String c = "0";
          	String d = "0";
          	String e = "0";
        	if(i<10){
            	e = Integer.toString(i);              
        	}else if(i<100){
            	d = Integer.toString(i/10);
            	e = Integer.toString(i%10);
        	}else{
              	c = Integer.toString(i/100);
            	d = Integer.toString((i%100)/10);
            	e = Integer.toString(i%10);          
        	}

        	for(int j=0;j<a;j++){
              	boolean flag = false;
              
              	int f = b.indexOf(c);
              	int g = b.indexOf(d,f+1);
              	int h = b.indexOf(e,g+1);
              
            	if(f!=-1&&g!=-1&&h!=-1){
                	sum = sum + 1;
                  	break;
                }
            
            }
        }
      	System.out.println(sum);
      
      	
	}
}