import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int tp = 0;
        int hp = 0;

        for(int i=0;i<n;i++){
            String tt = scn.next();
            String ht = scn.next();
            int result = tt.compareTo(ht);
            if (result<0){
                hp +=3;
            }else if(result>0){
                tp +=3;
            }else{
                tp +=1;
                hp +=1;
            }
        }

        System.out.println(tp+" "+hp);

        scn.close();
    }

}
