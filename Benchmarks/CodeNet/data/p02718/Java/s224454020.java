import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        String line = lines[0];
        String[] a = line.split(" ");
        int N = Integer.parseInt(a[0]);
        int M = Integer.parseInt(a[1]);

        String line1 = lines[1];
        String[] b = line1.split(" ");
        //int cost = Integer.parseInt(b[i]);
        

        int total = 0;
        int[] numvote = new int[b.length];
        for (int i = 0; i < b.length; i++){
            int vote = Integer.parseInt(b[i]);
            numvote[i] = vote;
            total += vote;
        }
    
        int count = 0;
        for (int j = 0; j < b.length; j++){
            int rank = numvote[j];
            if(rank >= total * (1.0/(4.0 * (double)M))){
                count++;
            }
        }
        if (count >= M){
            System.out.println("Yes");
        } else {
            System.out.println("No");
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
