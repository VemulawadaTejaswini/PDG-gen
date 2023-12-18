import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        
        String[] l = scan.nextLine().split(" ");
        int a = Integer.parseInt(l[0]);
        int b = Integer.parseInt(l[1]);
        String s = scan.nextLine();

        if(s.length() != (a+b+1)){
            System.out.println("No");
            scan.close();
            return;
        }

        String res = "Yes";
        for(int i=0; i<s.length(); i++){
            String str = s.substring(i, i+1);
            if(i==a && !str.equals("-")){
                res = "No";
                break;
            }else if(i!=a && !isNum(str)){
                res = "No";
                break;
            }
        }
        
        System.out.println(res);
        scan.close();
        
    }
    private static boolean isNum(String str){
        try{
            Integer.parseInt(str);
            return true;
        }catch(Exception e){
            return false;
        }
    }
}