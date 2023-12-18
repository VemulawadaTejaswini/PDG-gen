import java.util.*;
public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String[] str = lines[0].split(" ");
        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);
        
        //獲得票数をint型配列へ
        String[] str2 = lines[1].split(" ");
        int[] z = new int[n];
        ArrayList<Integer> h = new ArrayList<>();
            for(int i = 0; i < n; i++){
                z[i] = Integer.parseInt(str2[i]);
                h.add(z[i]);
            }
        Collections.sort(h);
        Collections.reverse(h);
            //総獲得票数
        int total = 0;
            for (int i = 0; i < h.size(); i++){
                total = total + h.get(i);
            }
            //M番目の人気商品が全体の1/4M以下ならno
            if(h.get(m - 1) < total*1.0/(4.0*m)){
                System.out.println("No");
            } else {
            System.out.println("Yes");
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