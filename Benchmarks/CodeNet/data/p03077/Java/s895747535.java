import java.util.*;

import javafx.util.converter.PercentageStringConverter;
public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);
    
    long N = sc.nextLong();
    long A = sc.nextLong();
    long B = sc.nextLong();
    long C = sc.nextLong();
    long D = sc.nextLong();
    long E = sc.nextLong();

    sc.close();

    long[] people = new long[6];

    Arrays.fill(people, 0);

    people[0] = N;

    long count = 0;

    while (people[5] != N) {
      
      if(E < people[4]){
        people[5] += E;
        people[4] -= E;
      } else {
        people[5] += people[4];
        people[4] = 0;
      }

      if(D < people[3]){
        people[4] += D;
        people[3] -= D;
      } else {
        people[4] += people[3];
        people[3] = 0;
      }

      if(C < people[2]){
        people[3] += C;
        people[2] -= C;
      } else {
        people[3] += people[2];
        people[2] = 0;
      }

      if(B < people[1]){
        people[2] += B;
        people[1] -= B;
      } else {
        people[2] += people[1];
        people[1] = 0;
      }

      if(A < people[0]){
        people[1] += A;
        people[0] -= A;
      } else {
        people[1] += people[0];
        people[0] = 0; 
      }

      count++;

    }

    System.out.println(count);
    
  }

}