import java.util.*;


public class Main {
    public static void main(String[] args) {
        // 自分の得意な言語で
        // Let's チャレンジ！！

        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String s[]=line.split("",0);
        int num=s.length;
        boolean b=false;
        if(num==2){
            if(s[0].equals(s[1])){
                System.out.println("1 2");
            }
        }
        else {
            for(int i=0;i<num-2;i++){
                int k=0;
                if(s[i].equals(s[i+1]))
                    k++;
                if(s[i].equals(s[i+2]))
                    k++;
                if(s[i+1].equals(s[i+2]))
                    k++;
                    if(k>0){
                        System.out.println(i+1+" "+(i+3));
                        b=true;
                        break;
                    }
            }
            
        }
        if(!b)System.out.println("-1 -1");
        
    }
}