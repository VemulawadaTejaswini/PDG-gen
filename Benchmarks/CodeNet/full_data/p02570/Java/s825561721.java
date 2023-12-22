class Main {
public static void main(String[] args) {
  final Integer distance = Integer.valueOf(args[0]);
  final Integer time = Integer.valueOf(args[1]);
  final Integer velocity = Integer.valueOf(args[2]);
  
  if(time > (float)distance / (float)velocity) {
    print("Yes");
  } else {
    print("No");
  }
}
}