import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String str = sc.next();
        int q = sc.nextInt();

        for(int i = 0; i < q; i++){
            String cmd = sc.next();

            if(cmd.equals("replace")){
                int a = sc.nextInt();
                int b = sc.nextInt();
                String p = sc.next();
                String replaced;
                if(a == 0 && b == cmd.length() - 1)
                   replaced = cmd;
                else if(a == 0)
                    replaced = p + cmd.substring(b + 1, cmd.length() - 1);
                else if(b == cmd.length() - 1)
                    replaced = cmd.substring(0, a - 1) + p;
                else
                    replaced = cmd.substring(0, a - 1) + p + cmd.substring(b + 1, cmd.length() - 1);
                cmd = replaced;
                System.out.println(cmd);
            }
            else if(cmd.equals("reverse")){
                int a = sc.nextInt();
                int b = sc.nextInt();
                String reversed = null;
                for(int j = 0; j < a; j++)
                    reversed += cmd.charAt(j);
                for(int j = a; j <= b; j++)
                    reversed += cmd.charAt(b - (j - a));
                for(int j = b + 1; j < cmd.length(); j++)
                    reversed += cmd.charAt(j);
                cmd = reversed;
                System.out.println(cmd);
            }
            else{
                int a = sc.nextInt();
                int b = sc.nextInt();
                for(int j = a; j <= b; j++)
                    System.out.print(cmd.charAt(j));
                System.out.println("");
            }
        }
        sc.close();
    }
}

