import java.io.*;
public class Main{

    public static int[] sort(String s[]){
        int[] sides = new int[s.length];
        for(int i = 0;i < s.length; i++){
            sides[i] = Integer.parseInt(s[i]);
        }
        for(int j = 1;j < sides.length; j++){
            if(sides[0] < sides[j]){
                int n = sides[0];
                sides[0] = sides[j];
                sides[j] = n;
            }
        }
        return sides;
    }
    public static void main(String[] args)throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        int num = Integer.parseInt(str);
        while(num <= 0 || num > 1000){
            str = br.readLine();
            num = Integer.parseInt(str);
        }
        String str1;
        String side[][];
        side = new String[num][];
        int sides[][];
        sides = new int[num][];
        int a = 0;
        while(a != num){
            str1 = br.readLine();
            side[a] = str1.split(" ", 3);
            sides[a] = sort(side[a]);
            a++;
        }
        for(int k = 0;k < num;k++){
             if(sides[k][0]*sides[k][0] == sides[k][2]*sides[k][2] +sides[k][1]*sides[k][1]){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }
        }
    }
}