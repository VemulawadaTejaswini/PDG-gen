import java.util.*;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

       String str = sc.nextLine();

       int q = Integer.parseInt(sc.nextLine());

       int a,b;
       String order,replace_str,reverse_str,print_str;
       StringBuffer sb,sb_reverse;
       for(int i = 0;i < q;i++){
           order = sc.next();
           sb = new StringBuffer(str);
           a = Integer.parseInt(sc.next());
           b = Integer.parseInt(sc.next());
           switch(order){
            case "replace":
                replace_str = sc.next();
                sb.replace(a,b + 1,replace_str);
                str = sb.toString();
                break;
            case "reverse":
                reverse_str = str.substring(a,b + 1);
                sb_reverse = new StringBuffer(reverse_str);
                sb_reverse.reverse();
                sb.delete(a,b + 1);
                sb.insert(a,sb_reverse);
                str = sb.toString();
                break;
            case "print":
                print_str = str.substring(a,b + 1);
                System.out.println(print_str);
                break;
            }
        }
    }
}
