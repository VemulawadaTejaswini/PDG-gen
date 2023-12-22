import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        String[] lines = getStdin();
        
        for (int i = 0; i < lines.length; i++){
            String str = lines[i];
            String[] str1 = str.split(" ");
            int j = 0;
            int num = Integer.parseInt(str1[j]);
            int num1 = Integer.parseInt(str1[j + 1]);
            int n = num;
                if (num > num1){
                    num = num1;
                    num1 = n;
                    System.out.println(num + " " + num1);
                } else if (num == 0 && num1 ==0){
                    return;
                } else {
                    System.out.println(num + " " + num1);
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

