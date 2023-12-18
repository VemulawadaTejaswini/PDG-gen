import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long A = scan.nextLong();
    long B = scan.nextLong();
    long C = scan.nextLong();
    long D = scan.nextLong();
    long CD = lcm(C , D);

    long tmpA = A;
    long tmpB = B;
    long cn1 = 0;
    long dn1 = 0;
    long cdn1 = 0;

    while(tmpB >= 0) {
      if (tmpB % C == 0) {
        cn1 = tmpB / C;
        break;
      }
      tmpB--;
    }
    long cn2 = cn1;
    while(true) {
      cn2--;
      if(cn2 * C < A) {
        cn2++;
        break;
      }
    }


    tmpB = B;
    while(tmpB >= 0) {
      if (tmpB % D == 0) {
        dn1 = tmpB / D;
        break;
      }
      tmpB--;
    }
    long dn2 = dn1;
    while(true) {
      dn2--;
      if(dn2 * C < A) {
        dn2++;
        break;
      }
    }

    tmpB = B;
    while(tmpB >= 0) {
      if (tmpB % CD == 0) {
        cdn1 = tmpB / D;
        break;
      }
      tmpB--;
    }
    long cdn2 = cdn1;
    while(true) {
      cdn2--;
      if(cdn2 * C < A) {
        cdn2++;
        break;
      }
    }

//    System.out.println(cn1);
//    System.out.println(cn2);
//    System.out.println(dn1);
//    System.out.println(dn2);
//    System.out.println(cdn1);
//    System.out.println(cdn2);

    long cn = cn1 - cn2 + 1;

    long dn = dn1 - dn2 + 1;

    long cdn = cdn1 - cdn2;
    if(cdn != 1) {
      cdn++;
    }

    long result = B - A + 1 - cn - dn + cdn;




//    for(int i = (int) A; i <= B; i++) {
//      if(i % CD == 0 || i % C == 0 || i % D == 0) {
//        // nothing
//      } else {
//        count++;
//      }
//    }

    System.out.println(result);

  }

  static long lcm (long a, long b) {
    long temp;
    long c = a;
    c *= b;
    while((temp = a%b)!=0) {
      a = b;
      b = temp;
    }
    return (long)(c/b);
  }
}

