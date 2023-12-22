import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int kill_pos = scan.nextInt();
      	int kill_velo = scan.nextInt();
		int nige_pos = scan.nextInt();
        int nige_velo = scan.nextInt();
        int time = scan.nextInt();
        String yes = "";
		String no = "NO";
      
        for(int i = 0; i < time; i++){
          kill_pos += kill_velo;
          nige_pos += nige_velo;
          if(kill_pos == nige_pos)yes = "YES";
        }
      
        scan.close();
      
        if(yes != ""){
          System.out.println(yes);
        }else{
          System.out.println(no);
        }
    }
}