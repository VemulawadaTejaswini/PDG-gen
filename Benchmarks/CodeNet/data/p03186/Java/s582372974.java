import java.util.Objects;
import java.util.Scanner;

Scanner scanner = null;
try {
  scanner = new Scanner(System.in);

  int ACookieNum = scanner.nextInt();
  int BCookieNum = scanner.nextInt();
  int CCookieNum = scanner.nextInt();

  int poisonRecovery = ACookieNum + BCookieNum;

  if (poisonRecovery >= CCookieNum){
    return BCookieNum + CCookieNum;
  } else {
    return BCookieNum + CCookieNum -1;
  }
} finally {
  if (!Objects.isNull(scanner)) {
    scanner.close();
  }
}
}
