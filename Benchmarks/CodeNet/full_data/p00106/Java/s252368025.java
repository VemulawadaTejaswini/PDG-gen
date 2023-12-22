/*
 * Copyright Narushima Hironori. All rights reserved.
 */
package aizuonlinejudge0106;

import java.io.*;
import java.util.*;

/**
 * http://judge.u-aizu.ac.jp/onlinejudge/description.jsp?id=0106
 */
class Main {
	
	static class Shop {
		int price, volume, discountedPrice, discountedPer;
		
		public Shop(int volume, int price, double discount, int per) {
			this.volume = volume;
			this.price = price;
			
			discountedPrice = (int) (price * per - price * per * discount);
			discountedPer = per;
		}
		
		int calcPrice(int count) {
			int total = 0;
			while(count >= discountedPer) {
				total += discountedPrice;
				count -= discountedPer;
			}
			return total + price * count;
		}
		
		int maxBuyCount(int buyVolume) {
			return buyVolume / volume;
		}
		
	}

	public static void main(String[] args) throws IOException {
		Main calc = new Main();
		
		BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
		for (String l; (l = r.readLine()) != null;) {
			int volume = Integer.parseInt(l);
			if(volume == 0) {
				break;
			}
			System.out.println(calc.calc(volume));
		}
		
	}

	Shop[] shops = {
			new Shop(200, 380, 0.20, 5),
			new Shop(300, 550, 0.15, 4),
			new Shop(500, 850, 0.12, 3),
	};
	
	public int calc(int volume) {
		if(volume % 100 != 0) {
			throw new IllegalArgumentException();
		}
		
		int[] buyCounts = new int[shops.length + 1];
		List<int[]> results = new ArrayList<int[]>();
		calc(results, buyCounts, 0, volume);
		
		Collections.sort(results, new Comparator<int[]>() {
			
			@Override
			public int compare(int[] a, int[] b) {
				int ap = a[shops.length];
				int bp = b[shops.length];
				return ap < bp ? -1 : ap == bp ? 0 : 1;
			};
			
		});
		
		return results.get(0)[shops.length];
	}

	void calc(List<int[]> results, int[] count, int shopIndex, int buyVolume) {
		if(shops.length == shopIndex) {
			if(buyVolume == 0) {
				int total = 0;
				for (int i = 0; i < shops.length; i++) {
					total += shops[i].calcPrice(count[i]);
				}
				count[shopIndex] = total;
				results.add(count.clone());
			}
		} else {
			Shop shop = shops[shopIndex];
			int maxBuyCount = shop.maxBuyCount(buyVolume);
			for (int buyCount = 0; buyCount <= maxBuyCount; buyCount++) {
				count[shopIndex] = buyCount;
				int nextBuyVolume = buyVolume - shop.volume * buyCount;
				calc(results, count, shopIndex + 1, nextBuyVolume);
			}
		}
	}

}