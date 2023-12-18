import java.util.*;

public class Main {
  public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
          String caster = sc.next();
          String weather = sc.next();
          int count = 0;
          String[] caster = new caster.split("");
          String[] weather = new weather.split("");
          for(int i = 0; i < caster.length; i++) {
            if(caster[i].equals(weather[i])){
              count++;
            }
          }
          System.out.println(count);
        }
      }