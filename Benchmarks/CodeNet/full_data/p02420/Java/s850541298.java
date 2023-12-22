
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean flag = true;
        String s = sc.next();
        StringBuffer sb = new StringBuffer(s);
        List<String> list = new ArrayList<String>();
        while(flag){
            int m = sc.nextInt();
            
            for(int i = 0;i<m;i++){
                int h = sc.nextInt();
                sb.append(sb.substring(0, h));
//                System.out.println(sb.toString());
                sb.delete(0, h);
//                System.out.println(sb.toString());
            }
            list.add(sb.toString());
            s = sc.next();
            sb = new StringBuffer(s);
            if(s.equals("-")){
                flag = false;
                sc.close();
            }
        }
        for(String out : list){
            System.out.println(out);
        }
        
    }
}

