import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        for(int i = 0;i < n;++i){
            String e = sc.next();
            switch(e) {
                case "print":
                    System.out.println(str.substring(sc.nextInt(), sc.nextInt()+1));
                    break;
                case "reverse": {
                    int b = sc.nextInt(), l = sc.nextInt();
                    StringBuilder sb = new StringBuilder(str.substring(b, l + 1)).reverse();
                    if(b > 0) sb.insert(0, str.substring(0, b + 1));
                    sb.append(str.substring(l+1));
                    str = sb.toString();
                }
                break;
                case "replace":{
                    int b = sc.nextInt(), l = sc.nextInt();
                    String p = sc.next();
                    StringBuilder sb = new StringBuilder(str.substring(0,b));
                    sb.append(p);
                    sb.append(str.substring(l+1));
                    str = sb.toString();
                }break;
                default:
                    break;
            }
        }
    }

}