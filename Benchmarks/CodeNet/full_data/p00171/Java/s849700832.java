import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
	final int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		while (true) {
			Dice[][] ds = new Dice[8][24];
			String str = sc.next();
			if (str.equals("0"))
				break;
			for (int i = 0; i < 8; i++) {
				if (i != 0) {
					str = sc.next();
				}
				Dice d = new Dice(str);
				Set<Dice> set = new HashSet<Dice>();
				for (int j = 0; j < 4; j++) {
					d = d.North();
					for (int k = 0; k < 4; k++) {
						d = d.Right();
						set.add(d);
					}
				}
				d = d.East();
				for (int k = 0; k < 4; k++) {
					d = d.Right();
					set.add(d);
				}
				d = d.East().East();
				for (int k = 0; k < 4; k++) {
					d = d.Right();
					set.add(d);
				}
				ds[i] = set.toArray(ds[i]);
			}
			boolean yes = false;
			int count = 0;
			for (int a = 0; a < 8; a++) {
				for (int b = 0; b < 8; b++) {
					if (b == a)
						continue;
					for (int c = 0; c < 8; c++) {
						if (a == c || b == c)
							continue;
						for (int d = 0; d < 8; d++) {
							if (a == d || b == d || c == d)
								continue;
							for (int e = 0; e < 8; e++) {
								if (a == e || b == e || c == e || d == e)
									continue;
								for (int f = 0; f < 8; f++) {
									if (a == f || b == f || c == f || d == f
											|| e == f)
										continue;
									for (int g = 0; g < 8; g++) {
										if (a == g || b == g || c == g
												|| d == g || e == g || f == g)
											continue;
										for (int h = 0; h < 8; h++) {
											if (a == h || b == h || c == h
													|| d == h || e == h
													|| f == h || g == h)
												continue;
											Dice[] pos = new Dice[8];
											for (int i = 0; i < 24; i++) {
												pos[0] = ds[a][i];
												for (int j = 0; j < 24; j++) {
													pos[1] = ds[b][j];
													boolean f1 = true;
													for (int m = 1; m <= 6; m++) {
														if (Math.abs(pos[0].cs[5]
																- pos[1].cs[m]) == 32) {
															f1 = false;
															break;
														}
													}
													if (f1)
														break;
													if (Math.abs(pos[0].cs[5]
															- pos[1].cs[2]) != 32)
														continue;
													for (int k = 0; k < 24; k++) {
														pos[2] = ds[c][k];
														boolean f2 = true;
														for (int m = 1; m <= 6; m++) {
															if (Math.abs(pos[1].cs[3]
																	- pos[2].cs[m]) == 32) {
																f2 = false;
																break;
															}
														}
														if (f2) {
															break;
														}
														if (Math.abs(pos[1].cs[3]
																- pos[2].cs[4]) != 32)
															continue;
														for (int p = 0; p < 24; p++) {
															pos[3] = ds[d][p];
															boolean f3 = true;
															boolean f4 = true;
															for (int m = 1; m <= 6; m++) {
																if (Math.abs(pos[2].cs[2]
																		- pos[3].cs[m]) == 32) {
																	f3 = false;
																}
																if (Math.abs(pos[0].cs[3]
																		- pos[3].cs[m]) == 32) {
																	f4 = false;
																}
															}
															if (f3 || f4) {
																break;
															}
															if (Math.abs(pos[2].cs[2]
																	- pos[3].cs[5]) != 32
																	|| Math.abs(pos[0].cs[3]
																			- pos[3].cs[4]) != 32)
																continue;
															for (int q = 0; q < 24; q++) {
																pos[4] = ds[e][q];
																boolean f5 = true;
																for (int m = 1; m <= 6; m++) {
																	if (Math.abs(pos[0].cs[6]
																			- pos[4].cs[m]) == 32) {
																		f5 = false;
																		break;
																	}
																}
																if (f5) {
																	break;
																}
																if (Math.abs(pos[0].cs[6]
																		- pos[4].cs[1]) != 32)
																	continue;
																for (int r = 0; r < 24; r++) {
																	pos[5] = ds[f][r];
																	boolean f6 = true;
																	boolean f7 = true;
																	for (int m = 1; m <= 6; m++) {
																		if (Math.abs(pos[4].cs[5]
																				- pos[5].cs[m]) == 32) {
																			f6 = false;
																		}
																		if (Math.abs(pos[1].cs[6]
																				- pos[5].cs[m]) == 32) {
																			f7 = false;
																		}
																	}
																	if (f6
																			|| f7) {
																		break;
																	}
																	if (Math.abs(pos[5].cs[2]
																			- pos[4].cs[5]) != 32
																			|| Math.abs(pos[1].cs[6]
																					- pos[5].cs[1]) != 32)
																		continue;
																	for (int s = 0; s < 24; s++) {
																		pos[6] = ds[g][s];
																		boolean f8 = true;
																		boolean f9 = true;
																		for (int m = 1; m <= 6; m++) {
																			if (Math.abs(pos[2].cs[6]
																					- pos[6].cs[m]) == 32) {
																				f8 = false;
																			}
																			if (Math.abs(pos[5].cs[3]
																					- pos[6].cs[m]) == 32) {
																				f9 = false;
																			}
																		}
																		if (f8
																				|| f9) {
																			break;
																		}
																		if (Math.abs(pos[5].cs[3]
																				- pos[6].cs[4]) != 32
																				|| Math.abs(pos[6].cs[1]
																						- pos[2].cs[6]) != 32)
																			continue;
																		for (int t = 0; t < 24; t++) {
																			pos[7] = ds[h][t];
																			boolean f10 = true;
																			boolean f11 = true;
																			boolean f12 = true;
																			for (int m = 1; m <= 6; m++) {
																				if (Math.abs(pos[6].cs[2]
																						- pos[7].cs[m]) == 32) {
																					f10 = false;
																				}
																				if (Math.abs(pos[4].cs[3]
																						- pos[7].cs[m]) == 32) {
																					f11 = false;
																				}
																				if (Math.abs(pos[3].cs[6]
																						- pos[7].cs[m]) == 32) {
																					f12 = false;
																				}
																			}
																			if (f10
																					|| f11
																					|| f12) {
																				break;
																			}
																			if (Math.abs(pos[4].cs[3]
																					- pos[7].cs[4]) != 32
																					|| Math.abs(pos[6].cs[2]
																							- pos[7].cs[5]) != 32
																					|| Math.abs(pos[7].cs[1]
																							- pos[3].cs[6]) != 32)
																				continue;
																			yes = true;
																			a = b = c = d = e = f = g = h = i = j = k = p = q = r = s = INF;
																			break;
																		}
																	}
																}
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.println(yes ? "YES" : "NO");
		}
	}

	public static void main(String[] args) throws Exception {
		new Main().run();
	}
}

class Dice {
	char cs[] = new char[7];

	Dice(char c1, char c2, char c3, char c4, char c5, char c6) {
		cs[1] = c1;
		cs[2] = c2;
		cs[3] = c3;
		cs[4] = c4;
		cs[5] = c5;
		cs[6] = c6;
	}

	Dice(String str) {
		char[] tmp = str.toCharArray();
		for (int i = 0; i < 6; i++) {
			cs[i + 1] = tmp[i];
		}
	}

	public Dice North() {
		return new Dice(cs[2], cs[6], cs[3], cs[4], cs[1], cs[5]);
	}

	public Dice East() {
		return new Dice(cs[4], cs[2], cs[1], cs[6], cs[5], cs[3]);
	}

	public Dice Right() {
		return new Dice(cs[1], cs[4], cs[2], cs[5], cs[3], cs[6]);
	}

	public String toString() {
		return Arrays.toString(cs);
	}
}