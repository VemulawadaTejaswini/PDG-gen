//package sportprogramming;

import java.util.*;

public class Main {
	public static void A() {
		Scanner s = new Scanner(System.in);
		String str = s.next();
		long k = s.nextLong();
		
		long ans = 0;
	
		char prev = str.charAt(0);
		for(int j = 1; j < str.length(); j++) {
			if(str.charAt(j) == prev) {
				ans++;
				prev = '-';
			} else {
				prev = str.charAt(j);
			}
		}
		k--;
		if(k > 0) {
			long newans = 0;
			for(int j = 0; j < str.length(); j++) {
				if(str.charAt(j) == prev) {
					newans++;
					prev = '-';
				} else {
					prev = str.charAt(j);
				}
			}
			newans += (newans * (k - 1));
			ans += newans;
		}
			
		System.out.println(ans);
	}
	
	public static boolean isSame(int[] indexes, int[] arr1, int[] arr2, int[] arr3) {
		if(arr1[indexes[0]] == arr2[indexes[1]] && arr3[indexes[2]] == arr2[indexes[1]]) {
			return true;
		}
		return false;
	}
	
	public static void moveIndexes(int[] indexes, int[] arr1, int[] arr2, int[] arr3) {
		int max = Math.max(arr1[indexes[0]], Math.max(arr2[indexes[1]], arr3[indexes[2]]));
		if(arr1[indexes[0]] < max) {
			indexes[0]++;
		}
		if(arr2[indexes[1]] < max) {
			indexes[1]++;
		}
		if(arr3[indexes[2]] < max) {
			indexes[2]++;
		}
	}
	
	
	
	
	public static List<Integer> arraysIntersection(int[] arr1, int[] arr2, int[] arr3) {
        List<Integer> list = new ArrayList<>();
        
        int[] indexes = new int[3];
        
        while(indexes[0] < arr1.length && indexes[1] < arr2.length && indexes[2] < arr3.length) {
        	if(isSame(indexes, arr1, arr2, arr3)) {
        		list.add(arr1[indexes[0]]);
        		for(int i = 0; i < indexes.length; i++) {
        			indexes[i]++;
        		}
        	} else {
        		moveIndexes(indexes, arr1, arr2, arr3);
        	}
        }
        return list;
    }
	
	
	static HashMap<String, Boolean> map = new HashMap<>();
    
    public static boolean isValid(String str, int i, int j, int k) {
    	String key = i + ":" + j + ":" + k;
        if(i >= str.length() || j < 0) {
            return false;
        }

        if(k < 0) {
        	return false;
        }
        
        if(i == j || i > j) {
            return true;
        }
        
        if(map.containsKey(key)) {
        	return map.get(key);
        }
            
        if(str.charAt(i) == str.charAt(j)) {
        	boolean result = isValid(str, i+1, j-1, k); 
            map.put(key, result);
        	return result;
        }
    	boolean result = isValid(str, i+1, j, k - 1) || isValid(str, i, j-1, k - 1);
    	map.put(key, result);
    	return result;
    }
    
    public static boolean isValidPalindrome(String s, int k) {
        return isValid(s, 0, s.length() - 1, k);
    }
	
    
    public static double getSlope(int[] p1, int[] p2) {
        if(p2[0] - p1[0] == 0) {
            return Double.MAX_VALUE;
        }
        return (p2[1] - p1[1]) * 1.0 /(p2[0] - p1[0]);
    }

    
    public static int maxPoints(int[][] points) {
        HashMap<Double, HashSet<int[]>> map = new HashMap<>();
        
        if(points.length == 0) {
            return 0;
        }
        
        for(int i = 0; i < points.length; i++) {
            for(int j = i + 1; j < points.length; j++) {
                int[] point1 = points[i];
                int[] point2 = points[j];
                double slope = getSlope(point1, point2);
                if(!map.containsKey(slope)) {
                    map.put(slope, new HashSet<>());
                }
                HashSet<int[]> temp = map.get(slope);
                temp.add(point1);
                temp.add(point2);
            }
        }
        int max = 1;
        for(double d: map.keySet()) {
            max = Math.max(max, map.get(d).size());
        }
        return max;
    }
    
    public static String solve(List<List<Integer>> arr) {
        if(arr.size() <= 1) {
            return "YES";
        }
        List<Integer> first = arr.get(0);
        int start = first.get(0);
        for(int i = 1; i < arr.size(); i++) {
            List<Integer> current = arr.get(i);
            Stack<Integer> index = new Stack<>();
            for(int j = 0; j < current.size(); j++) {
                if(current.get(j) == start) {
                    index.add(j);
                }
            }
            boolean flag = false;
            while(index.size() > 0) {
                int ind = index.pop();
                int k = 0;
                boolean isDone = true;
                while(k < first.size()) {
                    if(first.get(k).intValue() != current.get(ind).intValue()) {
                        isDone = false;
                        break;
                    }
                    k++;
                    ind++;
                    if(ind == current.size()) {
                        ind = 0;
                    }
                }
                if(isDone) {
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                return "NO";
            }
        }
        return "YES";
    }
  

    public static HashMap<Integer, Integer> getPallindrome(String str) {
        HashMap<String, Boolean> dp = new HashMap<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        for(int i = 0; i < str.length(); i++) {
        	dp.put(i + ":" + i, true);
        	map.put(1, map.get(1) + 1);
        }
        
        for(int size = 1; size < str.length(); size++) {
        	for(int i = 0; i  + size < str.length(); i++) {
        		int start = i;
        		int end = i + size;
        		if(str.charAt(start) != str.charAt(end)) {
        			dp.put(start + ":" + end, false);
        		} else {
        			if(start + 1 < end - 1) {
        				if(dp.get((start + 1) + ":" + (end - 1))) {
        					dp.put(start + ":" + end, true);
        					int count = end - start + 1;
        					if(!map.containsKey(count)) {
        						map.put(count, 0);
        					}
        					map.put(count, map.get(count) + 1);
        				} else {
        					dp.put(start + ":" + end, false);
        				}
        			} else {
        				dp.put(start + ":" + end, true);
        				int count = end - start + 1;
    					if(!map.containsKey(count)) {
    						map.put(count, 0);
    					}
    					map.put(count, map.get(count) + 1);
        			}
        		}
        		
        	}
        }
        return map;
    }

    public static List<Long> howManyPalindromes(String s, List<Integer> l, List<Integer> r) {
        List<Long> result = new ArrayList<Long>();
        HashMap<Integer, Integer> map = getPallindrome(s);
        for(int i = 0; i < l.size(); i++) {
            int min = l.get(i);
            int max = r.get(i);
            long count = 0;
            for(int size = min; size <= max; size++) {
                if(map.containsKey(size)) {
                	count += map.get(size);
                }
            }
            result.add(count);
        }
        return result;
    }
    
    
    static List<String>[] dp;
    
    public static List<String> getWordsDP(String str, int index, HashSet<String> map) {
        List<String> result = new ArrayList<>();
        
        if(dp[index] != null) {
        	return dp[index];
        }
        
        for(int i = index; i < str.length(); i++) {
            String sub = str.substring(index, i + 1);
            if(map.contains(sub)) {
            	List<String> res = new ArrayList<>();
            	if(i + 1 < str.length()) {
	            	res = getWordsDP(str, i + 1, map);
	            	
	            	List<String> temp = new ArrayList<>();
	            	
	            	for(int j = 0; j < res.size(); j++) {
	            		String current = res.get(j);
	            		current = sub + " " + current;
	            		temp.add(current);
	            	}
	            	result.addAll(temp);
	            	
            	} else {
            		res.add(sub);
            		result.addAll(res);
            	}
            }
        }
        
        if(result.size() == 0) {
        	dp[index] = result;
        	return result;
        }
        
        dp[index] = result;
        
        return result;
    }
    
    public static List<String> wordBreak(String s, List<String> wordDict) {
        dp = new ArrayList[s.length()];
        for(int i = 0; i < s.length(); i++) {
        	dp[i] = null;
        }
        HashSet<String> map = new HashSet<>();
        for(String str: wordDict) {
            map.add(str);
        }
        return getWordsDP(s, 0, map);
    }
    
    
    public static boolean isPossible(int n, int[] price, int index) {
    	if(n < 0) {
    		return false;
    	}
    	if(n == 0) {
    		return true;
    	}
    	
    	if(index >= price.length) {
    		return false;
    	}
    	
    	boolean flag = false;
    	flag = flag || isPossible(n, price, index + 1);
    	flag = flag || isPossible(n - price[index], price, index);
    	flag = flag || isPossible(n - price[index], price, index + 1);
    	return flag;
    }
    
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] price = {
			100, 101, 102, 103, 104, 105
		};
		int n = s.nextInt();
		if(isPossible(n, price, 0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}

}
