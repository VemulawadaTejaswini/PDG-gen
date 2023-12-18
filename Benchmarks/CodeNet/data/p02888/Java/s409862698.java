package com.company.atcoder;

import java.io.BufferedInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {
 Scanner sc = new Scanner(new BufferedInputStream(System.in));
 int n = sc.nextInt();
 sc.nextLine();
 int[] L = toArray(sc.nextLine());
 System.out.println(solve(n, L));
 }

 private static int solve(int n, int[] L) {
 Arrays.sort(L);
 int sum = 0;
 for (int i = 0; i < n; i++) {
 for (int j = i+1; j < n; j++) {
 int sup = L[i] + L [j];
 int inf = L[j] - L[i];
 int last = Math.max(getLastElement(L, sup),j);
 int first = Math.max(getFirstElement(L, inf), j);
 sum += Math.max(0, last - first -1);
 }
 }
 return sum;
 }

 private static int getFirstElement(int[] L, int val) {
 int idx = Arrays.binarySearch(L, val);
 if(idx < 0) return -idx-1;
 while (idx >= 1 && L[idx] == L[idx-1]) {
 idx--;
 }
 return idx;
 }

 private static int getLastElement(int[] L, int val) {
 int idx = Arrays.binarySearch(L, val);
 if(idx < 0) return -idx-1;
 while (idx < L.length-1 && L[idx] == L[idx+1]) {
 idx++;
 }
 return idx;
 }

 private static int[] toArray(String line) {
 return Arrays.stream(line.split(" ")).mapToInt(Integer::valueOf).toArray();
 }
}