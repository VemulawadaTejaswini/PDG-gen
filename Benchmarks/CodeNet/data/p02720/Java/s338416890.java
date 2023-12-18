import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        sc.close();
        long work = 0;
        long runrun = 1;
        while(true){
            String jude= String.valueOf(runrun);
            boolean flag = true;    
            if(jude.length() == 1){
                work++;
            }else{
                for(int i=0;i<jude.length()-1;i++){
                    long a = Character.getNumericValue(jude.charAt(i));
                    long b = Character.getNumericValue(jude.charAt(i+1));
                    if(Math.abs(a-b) > 1){
                        flag = false;
                        break;
                    }
                }
                if(flag){
                    work++;
                }
            }
            if(k == work){
                System.out.println(runrun);
                return;
            }
            runrun++;
        }
    }
}