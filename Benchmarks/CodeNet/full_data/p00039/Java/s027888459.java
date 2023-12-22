import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main{
    public static void main(String[] args){
        BufferedReader reader = 
        		new BufferedReader(new InputStreamReader(System.in));
        
        while(true){
        	try{
            String str = reader.readLine();
            char[] ch = str.toCharArray();
            int[] a = new int[ch.length];
            
            for(int i = 0;i < ch.length;i++){
                switch(ch[i]){
                    case 'I': a[i] = 1; break;
                    case 'V': a[i] = 5; break;
                    case 'X': a[i] = 10; break;
                    case 'L': a[i] = 50; break;
                    case 'C': a[i] = 100; break;
                    case 'D': a[i] = 500; break;
                    case 'M': a[i] = 1000; break;
                    default: a[i] = 0; break;
                }
            }
            int sum = a[a.length-1];
            
            for(int i = a.length-2;i >= 0;i--){
                if(a[i] >= a[i+1]){
                    sum += a[i];
                }else{
                    sum -= a[i];
                }
            }
            
            System.out.println(sum);
            
        }catch(IOException e){
        }
    }
}
}