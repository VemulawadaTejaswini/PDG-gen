package abc125;

import java.util.ArrayList;
import java.util.Scanner;

public class B_resale {

	/*
	 * ���蕶 N�̕��΂������Ai�Ԗڂ̕��΂̉��l�� Vi�ł��B ���Ȃ��͂������̕��΂̒����炢�������I���Ŏ��ɓ����܂��B
	 * ���̂Ƃ��A1���I�΂Ȃ��Ƃ��A�S�đI���ł��\���܂����B �������Ai�Ԗڂ̕��΂����ɓ������ꍇ�R�X�g Ci���x�����Ȃ����΂����܂����B
	 * ���ɓ��ꂽ���΂̉��l�̍��v�� X�A�x�������R�X�g�̍��v�� Y�Ƃ��܂��B X-Y�̍ő��l�����߂Ă��������B ���� ���͂͑S�Đ����ł����B 1��N��20
	 * 1��Ci,Vi��50
	 */

	public static void main(String[] args) {

		final Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		ArrayList<Integer> value = new ArrayList<Integer>();
		ArrayList<Integer> cost = new ArrayList<Integer>();

		for (int i = 0; i < n; i++) {
			final int v = sc.nextInt();
			value.add(v);
		}
		for (int i = 0; i < n; i++) {
			final int c = sc.nextInt();
			cost.add(c);
		}

		int result = 0;
		for (int j = 0; j < n; j++) {
			final int result1 = value.get(j) - cost.get(j);
			if (result1 < 0) {
				continue;
			}
			result = result + result1;
		}

		System.out.println(result);

	}

}
