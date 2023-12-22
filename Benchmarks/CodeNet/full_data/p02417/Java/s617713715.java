import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    char[] data = new char[1000];
    String sentence = scanner.nextLine();
    int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0, g = 0, h = 0, i = 0, j = 0, k = 0, l = 0, m = 0, n = 0, o = 0, p = 0, q = 0, r = 0, s = 0;
    int t = 0, u = 0, v = 0, w = 0, x = 0, y = 0, z = 0;
    sentence = sentence.toLowerCase();
    for(int ai = 0; ai < sentence.length(); ai++){
      data[ai] = sentence.charAt(ai);
      if(data[ai] == 'a') a += 1;
      if(data[ai] == 'b') b += 1;
      if(data[ai] == 'c') c += 1;
      if(data[ai] == 'd') d += 1;
      if(data[ai] == 'e') e += 1;
      if(data[ai] == 'f') f += 1;
      if(data[ai] == 'g') g += 1;
      if(data[ai] == 'h') h += 1;
      if(data[ai] == 'i') i += 1;
      if(data[ai] == 'j') j += 1;
      if(data[ai] == 'k') k += 1;
      if(data[ai] == 'l') l += 1;
      if(data[ai] == 'm') m += 1;
      if(data[ai] == 'n') n += 1;
      if(data[ai] == 'o') o += 1;
      if(data[ai] == 'p') p += 1;
      if(data[ai] == 'q') q += 1;
      if(data[ai] == 'r') r += 1;
      if(data[ai] == 's') s += 1;
      if(data[ai] == 't') t += 1;
      if(data[ai] == 'u') u += 1;
      if(data[ai] == 'v') v += 1;
      if(data[ai] == 'w') w += 1;
      if(data[ai] == 'x') x += 1;
      if(data[ai] == 'y') y += 1;
      if(data[ai] == 'z') z += 1;
    }
    System.out.println("a : " + a);
    System.out.println("b : " + b);
    System.out.println("c : " + c);
    System.out.println("d : " + d);
    System.out.println("e : " + e);
    System.out.println("f : " + f);
    System.out.println("g : " + g);
    System.out.println("h : " + h);
    System.out.println("i : " + i);
    System.out.println("j : " + j);
    System.out.println("k : " + k);
    System.out.println("l : " + l);
    System.out.println("m : " + m);
    System.out.println("n : " + n);
    System.out.println("o : " + o);
    System.out.println("p : " + p);
    System.out.println("q : " + q);
    System.out.println("r : " + r);
    System.out.println("s : " + s);
    System.out.println("t : " + t);
    System.out.println("u : " + u);
    System.out.println("v : " + v);
    System.out.println("w : " + w);
    System.out.println("x : " + x);
    System.out.println("y : " + y);
    System.out.println("z : " + z);

  }
}