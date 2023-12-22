import java.util.*

public class main {

  public static void main(String... args){
    IntStream.of(1,2,3,4,5,6,7,8,9).flatMap(i -> {
      IntStream.of(1*i, 2*i, 3*i, 4*i, 5*i, 6*i, 7*i, 8*i, 9*i)
    }).forEach(System.out::println);
  }

}