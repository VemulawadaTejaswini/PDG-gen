//semicolon less Java with Stream API
import java.util.stream.*;
import java.util.*;
class Main{
    public static void main(String[] args){
        if(Stream.<String[]>of(new String[]{
            new java.util.Scanner(System.in).next(),
            "CODEFESTIVAL2016"})
            .peek(str -> System.out.println(
                IntStream.range(0, 16)
                .filter(i -> str[0].charAt(i) != str[1].charAt(i))
                .count())
        ).count() > 0){}
    }
}