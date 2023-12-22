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
        String str1;
        while((str1 = br.readLine()) != null){
            String side[] = str1.split(" ", num);
            int sides[] = sort(side);
            if(sides[0]*sides[0] == sides[2]*sides[2] +sides[1]*sides[1]){
                System.out.println("Yes");
            }else{
                System.out.println("No");
            }
        }
    }
}