import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Arrays;
import java.util.Collections;
import java.util.*;
class Main{
public static void main(String[] args){
Scanner scan = new Scanner(System.in);
int K = scan.nextInt();
int X = scan.nextInt();
int sum = 500 * K;
if (sum >= X) {
  System.out.println("Yes");
}
else{
  System.out.println("No");
}
}
}
