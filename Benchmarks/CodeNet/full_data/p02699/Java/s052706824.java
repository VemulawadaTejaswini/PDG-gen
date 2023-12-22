int main (int sheep, int worf) {
  if(sheep >= 1 && sheep <= 100 & worf >= 1 && worf <= 100) {
    if(sheep > worf) {
      System.out.println("safe");
    } else if (sheep <= worf) {
      System.out.println("unsafe");
    }
  }
}