import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    static private Scanner scan = new Scanner(System.in);
    public static void main(String args[]) {
//        int int1 = Integer.parseInt(scan.next());
//        int int2 = Integer.parseInt(scan.next());
//        int int3 = Integer.parseInt(scan.next());
//        int int4 = Integer.parseInt(scan.next());
        int ans_int = 0;
        String ans = "";
//        String temp_str1 = "";
//        String temp_str2 = "";
        int temp_int1 = 0;
        String str1 = scan.next();
        String list_s[] = str1.split("");
//        String str2 = scan.next();
//        String str3 = scan.next();
        double ans_dob = 0;
        ans="Yes";
        for(int i = 1;i<list_s.length+1;i++){
            if(i%2!=0){
                if(list_s[i-1].equals("L")){
                    ans="No";
                    break;
                }
            }else{
                if(list_s[i-1].equals("R")){
                    ans="No";
                    break;
                }
            }
        }

        PrintWriter out = new PrintWriter(System.out);
        out.println(ans);
        out.flush();
        scan.close();
    }
}
