import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String str1 = lines[0];
        int n = Integer.parseInt(str1);
        Boolean card[][] = new Boolean[4][13];
        for(int i = 0; i < 4; ++i){
            for(int j = 0; j < 13; ++j){
                card[i][j] = false;
            }
        }
        for(int i = 1; i <= n; ++i){
            String[] cinfo = lines[i].split(" ");
            String pic = cinfo[0];
            int cnum = Integer.parseInt(cinfo[1]);
            cnum--;
            if(pic.equals("H")){
                card[1][cnum] = true;
            } else if(pic.equals("S")){
                card[0][cnum] = true;
            } else if(pic.equals("C")){
                card[2][cnum] = true;
            } else if(pic.equals("D")){
                card[3][cnum] = true;
            }
        }
        for(int i = 0; i < 4; ++i){
            for(int j = 0; j < 13; ++j){
                if(card[i][j] == false){
                    if(i == 0) System.out.printf("%s %d", "S", j + 1);
                    else if(i == 1) System.out.printf("%s %d", "H", j + 1);
                    else if(i == 2) System.out.printf("%s %d", "C", j + 1);
                    else if(i == 3) System.out.printf("%s %d", "D", j + 1);
                    System.out.println();
                }
            }
        }
    }
  private static String[] getStdin() {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> lines = new ArrayList<>();
    while (scanner.hasNext()) {
      lines.add(scanner.nextLine());
    }
    return lines.toArray(new String[lines.size()]);
  }
}
