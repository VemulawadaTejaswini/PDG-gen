import java.util.*;
 
public class Main{

       public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        int H = sc.nextInt() + 2;
        int W = sc.nextInt() + 2;
        String[] s = new String[H];

        for(int i = 0; i < H; i++){
            if(i == 0 || i == H-1){
                for(int j = 0; j < W; j++){
                    if(j == 0){
                        s[i] = "#";
                    } else {
                        s[i] += "#";
                    }
                }
            } else {
                s[i] = "#" + sc.next() + "#";
            }
        }
        
        sc.close();
        for(int i = 1; i <= H-2; i++){
            for(int j = 1; j <= W-2; j++){
                if(s[i].charAt(j)== '.')
                    continue;
                else{
                    if(s[i+1].charAt(j) != '#' &&
                    s[i-1].charAt(j) != '#' &&
                    s[i].charAt(j+1) != '#' &&
                    s[i].charAt(j-1) != '#'){
                        System.out.println("No");
                        return;
                    }
                }
            }
        }
        System.out.println("Yes");
    }
}