package com.company;

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class Main {

  private static int goal;
  private static long count = 0;
  private static Integer[] sortedNumbers;
  private static HashMap<Integer, Long> countByPosition = new HashMap<>();

  public static void main(String[] args) {
    final Scanner scanner = new Scanner(System.in);
    goal = scanner.nextInt();
    final int K = scanner.nextInt();

    TreeSet<Integer> S = new TreeSet<>();
    for (int i = 0; i < K; i++) {
      int left = scanner.nextInt();
      int right = scanner.nextInt();

      while (left <= right) {
        S.add(left);
        left++;
      }
    }

    sortedNumbers = S.toArray(S.toArray(new Integer[0]));

    for (int i = 0; i < sortedNumbers.length; i++) {
      searchWay(1, sortedNumbers[i]);
    }

    System.out.println(count % 998244353);
  }

  private static void searchWay(int currentPosition, int offset) {
    int newPosition = currentPosition + offset;
    if (newPosition == goal) {
      count++;
      return;
    }

    if (newPosition > goal) {
      return;
    }

    Long memorizedCount = countByPosition.get(newPosition);
    if (memorizedCount != null) {
      count += memorizedCount;
      return;
    }

    long countBefore = count;
    for (Integer newOffset : sortedNumbers) {
      if (newPosition + newOffset > goal) {
        break;
      }
      searchWay(newPosition, newOffset);
    }
    countByPosition.put(newPosition, count - countBefore);

    return;
  }
}