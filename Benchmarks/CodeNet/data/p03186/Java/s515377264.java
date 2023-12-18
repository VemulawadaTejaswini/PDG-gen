Scanner scanner = new Scanner(System.in);
 
int ACokkieNum = scanner.nextInt();
int BCokkieNum = scanner.nextInt();
int CCokkieNum = scanner.nextInt();

int poisonRecovery = ACookieNum + BCookieNum;

if (poisonRecovery >= CCokkieNum){
  return BCookieNum + CCokkieNum;
} else {
  return eatCookieNum = BCookieNum + CCookieNum -1;
}
  
scanner.close();