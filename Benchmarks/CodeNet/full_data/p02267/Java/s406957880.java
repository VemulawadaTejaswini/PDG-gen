import java.util.*;
import java.io.*;
import static java.util.Arrays.*;
import static java.util.Collections.*;
import static java.lang.Math.*;

public class Main_linear_search {
  public static void main(String[] args) {
    int i, j;
    Scanner sc = new Scanner(System.in); 
    int n = Integer.parseInt(sc.next());;
    int t[] = new int[n];

    for (i=0; i<n; i++)
      t[i] = Integer.parseInt(sc.next());;

    int q = Integer.parseInt(sc.next());;
    Set s = new HashSet();
    for (i=0; i<q; i++)
      s.add(Integer.parseInt(sc.next()));

    int res = 0;
    for (i=0; i<n; i++)
      if (s.contains(t[i])) res++;

    System.out.println(res);
  }
}