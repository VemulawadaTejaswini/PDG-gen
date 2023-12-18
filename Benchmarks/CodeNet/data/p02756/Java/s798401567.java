import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();
        StringBuilder builder = new StringBuilder(s);
        int q = scanner.nextInt();

        int length = s.length();

        boolean asc = true;
        for (int i = 0; i < q; i++) {
            int query = scanner.nextInt();
            if (query == 1) {
//                builder = builder.reverse();
                asc = !asc;
            } else if (query == 2) {
                length++;
                int f = scanner.nextInt();
                String c = scanner.next();

                if (f == 1) {
                    if(asc) {
                        builder.insert(0, c);
                    }else{
                        builder.append(c);
                    }
                } else {
                    if(asc) {
                        builder.append(c);
                    }else{
                        builder.insert(0, c);
                    }
                }
            }
        }
        char[] str = builder.toString().toCharArray();
        if(asc){
            for(int i = 0 ; i < length ; i++){
                System.out.print(String.valueOf(str[i]));
            }
        }else{
            for(int i = length - 1; i >= 0 ; i--){
                System.out.print(String.valueOf(str[i]));
            }
        }
        System.out.println();
    }
}