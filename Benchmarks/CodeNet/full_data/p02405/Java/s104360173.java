import java.util.*;

public class Main{
    public static void main(String[] args){
        int h, w;
        int i, j, k = 0;
        String n = System.getProperty("line.separator");
        Scanner scanner = new Scanner(System.in);
        String nu;
        while(true){
            nu = scanner.next();
            h = Integer.parseInt(nu);
            nu = scanner.next();
            w = Integer.parseInt(nu);
            if(h == 0 && w == 0) break;
            else{
                for(i = 0; i < h; i++){
                    for(j = 0; j < w; j++){
                        if((j + i)% 2 == 0){
                            System.out.print("#");
                        }
                        else System.out.print(".");
                    }
                    System.out.print(n);

                }
            }
            k = 0;
            System.out.print(n);
        }
        scanner.close();
    }
}
