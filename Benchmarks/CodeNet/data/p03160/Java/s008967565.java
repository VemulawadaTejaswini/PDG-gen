public class Main {
  public int solution(int N, int[] costs) {
    // current index starting at 0
    return findLowestCost(N, costs, 0);
  }

  public int findLowestCost(int N, int[] costs, int currentIndex){
    int oneJumpCost = Integer.MAX_VALUE;
    int twoJumpCost = Integer.MAX_VALUE;
    if (currentIndex + 2 < N-1) { // Doesn't go out of bound
      twoJumpCost = findLowestCost(N, costs, currentIndex+2);
    } else if (currentIndex + 2 == N-1) { // Last Jump to be made
      twoJumpCost = costs[N-1] - costs[currentIndex];
    }
    if(currentIndex + 1 < N-1) { // Doesn't go out of bound
      oneJumpCost = findLowestCost(N, costs, currentIndex+1);
    } else if (currentIndex + 1 == N-1) { // Last jump to be made
      oneJumpCost = costs[N-1]-costs[currentIndex];
    }
    return Math.min(oneJumpCost, twoJumpCost);
  }
}
