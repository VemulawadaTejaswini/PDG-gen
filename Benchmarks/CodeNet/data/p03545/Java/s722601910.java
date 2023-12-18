import java.util.*;
import java.math.*;
     
class Main{
    public static void main(String[] args) {
        
        try(Scanner sc = new Scanner(System.in)){
            int a = Integer.parseInt(sc.next());
            int b = Integer.parseInt(sc.next());
            int c = Integer.parseInt(sc.next());
            int d = Integer.parseInt(sc.next());

            StringBuilder sb = new StringBuilder();

            if(isSeven(a, b, c, d)){
                sb.append(a);
                sb.append("+").append("b");
                sb.append("+").append("c");
                sb.append("+").append("d");
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, b, c, -d)){
                sb.append(a);
                sb.append("+").append("b");
                sb.append("+").append("c");
                sb.append("-").append("d");
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, b, -c, d)){
                sb.append(a);
                sb.append("+").append("b");
                sb.append("-").append("c");
                sb.append("+").append("d");
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, -b, c, d)){
                sb.append(a);
                sb.append("-").append("b");
                sb.append("+").append("c");
                sb.append("+").append("d");
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, -b, c, -d)){
                sb.append(a);
                sb.append("-").append("b");
                sb.append("+").append("c");
                sb.append("-").append("d");
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, -b, -c, d)){
                sb.append(a);
                sb.append("-").append("b");
                sb.append("-").append("c");
                sb.append("+").append("d");
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, b, -c, -d)){
                sb.append(a);
                sb.append("+").append("b");
                sb.append("-").append("c");
                sb.append("-").append("d");
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            } else if(isSeven(a, -b, -c, -d)){
                sb.append(a);
                sb.append("-").append("b");
                sb.append("-").append("c");
                sb.append("-").append("d");
                sb.append("=").append("7");
                
                System.out.println(sb.toString());
            }
            

        }catch(Exception e){
            e.printStackTrace();
        }        
    }

    private static boolean isSeven(int a, int b, int c, int d){
        if(a+b+c+d == 7) return true;
        else return false;
    }
}