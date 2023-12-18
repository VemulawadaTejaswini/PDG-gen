import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ketasu = sc.nextInt();
    String secret = sc.next();

    String[] pin = new String[ketasu];
    List<String> memory = new ArrayList<>();

    for(int i = 0; i < ketasu; i++)
      pin[i] = secret.substring(i, i+1);

    StringBuilder sb;
    long count = 0;

    for(int i = 0; i < ketasu-2; i++){
      sb = new StringBuilder(pin[i]);
      for(int j = i+1; j < ketasu-1; j++){
        sb.append(pin[j]);
        for(int k = j+1; k < ketasu; k++){
          sb.append(pin[k]);
          if(!memory.contains(sb.toString()))
            count++;
          memory.add(sb.toString());
          sb.setLength(sb.length()-1);
        }
        sb.setLength(sb.length()-1);
      }
    }
    // for(int i = 0; i < memory.size(); i++)
    //   System.out.printf("%s ", memory.get(i));

    System.out.println(count);
  }
}