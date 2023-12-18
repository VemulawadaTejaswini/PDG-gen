import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        
        for(int i=0; i<n; i++){
            sb.append(sc.next());
        }
        
        String a = sb.toString();
        
        int t = 1;
        int count = 0;
        while(true){
            String target = String.valueOf(t);
            if(a.indexOf(target)!=-1){
                a = a.substring(a.indexOf(target));
                count++;
                t++;
            }
            else{
                break;
            }
        }
        
        System.out.println(count!=0?sb.length()-count:-1);
    }
}